package Boks;
public class Fighter{
    String name;
    int damage;
    int health;
    int weight;
    
    Fighter(String name, int damage,int health,int weight){
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.weight = weight;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name+" " + this.damage + " Hasar Vurdu.");
        return foe.health - this.damage;
    }


}