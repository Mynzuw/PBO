//player
class Player{
    String name;
    double health;
    int level;

    //object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Health: "+ this.health +"hp");
        this.weapon.display();
        this.armor.display();
    }
}
// senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    void display(){
        System.out.println("Weapon: "+this.name+", power: "+ this.attackPower);
    }
}
// armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    void display(){
        System.out.println("Weapon: "+this.name+", power: "+ this.defencePower);
    }
}

public class Main4 {
    public static void main(String[] args) {
        // membuat object player
        Player player1 = new Player("ucup",100);
        Player player2 = new Player("otong",200);
        // membuat object weapon
        Weapon pedang = new Weapon("pedang",15);
        Weapon panah = new Weapon("panah",10);

        // membuat armor
        Armor bajubesi = new Armor("besi",10);
        Armor bajukayu = new Armor("kayu",10);
        // equip senjata dan armor
        player1.equipWeapon(pedang);
        player1.equipArmor(bajubesi);

        player2.equipWeapon(panah);
        player2.equipArmor(bajukayu);

        player1.weapon.display();
        player1.armor.display();

        System.out.println("\n");
        player2.weapon.display();
        player2.weapon.display();
    }
}