import java.util.Scanner;

public class ThreadCommunication extends Thread {

    private String threadName;

    private static final Object lock = new Object();

    private static boolean isPlaying = false;
    private static boolean isPaused = false;
    private static boolean shouldExit = false;

    private static final String musicFilePath = "wantu.mp3";

    public ThreadCommunication(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {

        if (threadName.equals("MusicPlayer")) {
            playMusic();

        } else if (threadName.equals("MusicController")) {
            controlMusic();
        }
    }

    private void playMusic() {

        System.out.println("MusicPlayer thread started.");

        while (true) {

            synchronized (lock) {

                while (!isPlaying && !shouldExit) {

                    try {
                        System.out.println(
                            "MusicPlayer: Waiting for music to play..."
                        );

                        lock.wait();

                    } catch (InterruptedException e) {

                        System.out.println(
                            "MusicPlayer interrupted."
                        );

                        return;
                    }
                }

                if (shouldExit) {
                    return;
                }

                System.out.println(
                    "MusicPlayer: Playing music from "
                    + musicFilePath
                );
            }


            try {

                for (int i = 1; i <= 10; i++) {

                    synchronized (lock) {

                        if (shouldExit) {
                            return;
                        }

                        while (isPaused && !shouldExit) {

                            System.out.println(
                                "MusicPlayer: Music is paused. Waiting..."
                            );

                            lock.wait();
                        }

                        if (shouldExit) {
                            return;
                        }
                    }

                    System.out.println(
                        "MusicPlayer: Playing... "
                        + (i * 500) + " ms"
                    );

                    Thread.sleep(500);
                }

                synchronized (lock) {

                    isPlaying = false;

                    System.out.println(
                        "MusicPlayer: Music finished."
                    );

                    lock.notifyAll();
                }

            } catch (InterruptedException e) {

                System.out.println(
                    "MusicPlayer interrupted."
                );

                return;
            }
        }
    }

    private void controlMusic() {

        System.out.println("MusicController thread started.");

        while (true) {

            synchronized (lock) {

                while (!isPlaying && !shouldExit) {

                    try {

                        System.out.println(
                            "MusicController: Waiting for music..."
                        );

                        lock.wait();

                    } catch (InterruptedException e) {

                        System.out.println(
                            "MusicController interrupted."
                        );

                        return;
                    }
                }

                if (shouldExit) {
                    return;
                }

                System.out.println(
                    "MusicController: Music is currently playing."
                );
            }

            synchronized (lock) {

                try {

                    lock.wait();

                } catch (InterruptedException e) {

                    System.out.println(
                        "MusicController interrupted."
                    );

                    return;
                }

                if (shouldExit) {
                    return;
                }
            }
        }
    }

    public static void pauseMusic() {

        synchronized (lock) {

            if (isPlaying && !isPaused) {

                isPaused = true;

                System.out.println(
                    "Main thread: Music paused."
                );

                lock.notifyAll();

            } else {

                System.out.println(
                    "Main thread: Music is not currently playing."
                );
            }
        }
    }

    public static void resumeMusic() {

        synchronized (lock) {

            if (isPlaying && isPaused) {

                isPaused = false;

                System.out.println(
                    "Main thread: Music resumed."
                );

                lock.notifyAll();

            } else {

                System.out.println(
                    "Main thread: Music is not paused."
                );
            }
        }
    }

    public static void startMusic() {

        synchronized (lock) {

            if (!isPlaying) {

                isPlaying = true;
                isPaused = false;

                System.out.println(
                    "Main thread: Starting music."
                );

                lock.notifyAll();

            } else {

                System.out.println(
                    "Main thread: Music is already playing."
                );
            }
        }
    }

    public static void exitMusic() {

        synchronized (lock) {

            shouldExit = true;

            System.out.println(
                "Main thread: Stopping music player..."
            );

            lock.notifyAll();
        }
    }

    public static void main(String[] args) {

        InterThreadCommunicationExample musicPlayer =
            new InterThreadCommunicationExample("MusicPlayer");

        InterThreadCommunicationExample musicController =
            new InterThreadCommunicationExample("MusicController");

        musicPlayer.start();
        musicController.start();

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("====================================");
        System.out.println("       SIMPLE MUSIC PLAYER");
        System.out.println("====================================");
        System.out.println("Commands:");
        System.out.println("play   - Play music");
        System.out.println("pause  - Pause music");
        System.out.println("resume - Resume music");
        System.out.println("exit   - Exit program");
        System.out.println("====================================");

        while (true) {

            System.out.print("\nEnter command: ");

            String input = scanner.nextLine().toLowerCase();

            if (input.equals("play")) {

                startMusic();

            } else if (input.equals("pause")) {

                pauseMusic();

            } else if (input.equals("resume")) {

                resumeMusic();

            } else if (input.equals("exit")) {

                exitMusic();

                break;

            } else {

                System.out.println(
                    "Invalid command."
                );
            }
        }

        scanner.close();

        System.out.println("Main thread: Program terminated.");
        System.exit(0);
    }
}
