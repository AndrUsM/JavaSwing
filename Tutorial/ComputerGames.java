import java.util.Scanner;
import  java.io.*;
interface Game{
    void setCharacteristic(String name, String creator, int size, String genre);
    void  getCharactristic();
    void setStringObject();
    void setIntObject();
    void getObject(String ObjName, String attr);

    void getObject(ComputerGame obj, String attr);
}
class ComputerGame implements Game{
    public String Name, Creator, Genre;
    public int Size;
    @Override
    public void setCharacteristic(String name, String creator, int size, String genre) {
        Name = name;
        Creator = creator;
        Size = size;
        Genre = genre;
    }

    @Override
    public void getCharactristic() {
        System.out.println("Name: " + Name + "\nCreator: "+ Creator + "\nSize: " + Size + "\nGenre: " + Genre);
    }

    @Override
    public void setStringObject() {
        int counter;
        Scanner cin = new Scanner(System.in);
        counter = cin.nextInt();
        String newVal = cin.nextLine();
        System.out.println("1 = Name\n2 = Creator\n3 = Genre");
        switch (counter){
            case 1:{
                Name = newVal;
                break;
            }
            case 2:{
                Creator = newVal;
                break;
            }
            case 3:{
                Genre = newVal;
                break;
            }
        }
    }
    @Override
    public void setIntObject(){
        int newVal;
        Scanner cin = new Scanner(System.in);
        newVal = cin.nextInt();
        int counter;
        counter = cin.nextInt();
        switch (counter){
            case 1: {
                Size = newVal;
            }
        }
    }

    @Override
    public void getObject(String ObjName, String attr) {

    }

    @Override
    public void getObject(ComputerGame obj, String attr) {
        attr.toLowerCase();
        if(attr == "name"){
            System.out.println(obj.Name);
        }
        else if(attr == "creator"){
            System.out.println(obj.Creator);
        }
        else if(attr == "genre"){
            System.out.println(obj.Genre);
        }
        else if(attr == "size"){
            System.out.println(obj.Size);
        }
    }
}
public class ComputerGames extends ComputerGame{//Virtualy create MMORPG
    String name;
    String race;
    String equipment;
    Scanner cin = new Scanner(System.in);
    public void createCharacter(){
        System.out.println("Name: ");
        this.name = cin.nextLine();
        System.out.println("Race: ");
        this.race = cin.nextLine();
        System.out.println("Equipment: ");
        this.equipment = cin.nextLine();
    }
    public void propertiesOfCharacter(ComputerGames obj){
        System.out.println("Name: " + obj.name + "\nRace: "+obj.race + "\nEquipment: " +
                obj.equipment);
    }

    public static void main(String[] args) {
        ComputerGames WOW = new ComputerGames();
        WOW.setCharacteristic("World of WarCraft", "Blizard", 1244, "MMORPG, First-person Stratagy");
        WOW.createCharacter();
        WOW.propertiesOfCharacter(WOW);
        WOW.getCharactristic();
        WOW.getObject(WOW, "name");
    }
}