class Country{
    String name;
    String continent;
    String region;
    String capital;

public void showInfo(){
    System.out.println("Name"+ name);
    System.out.println("Continent"+ continent);
    System.out.println("Region"+ region);
    System.out.println("Capital"+ capital);
}
}
public  void main(String[] args){
    Country c1 = new Country();
    c1.name = "Nepal";
    c1.continent = "Asia";
    c1.region = "South East Asia";
    c1. capital = "Kathmandu";
    Country c2 = new Country();
    c2.name = "India";
    c2.continent = "Asia";
    c2.region = "South East Asia";
    c2. capital = "New Delhi";
    c1.showInfo();
    c2.showInfo();
}
