

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            if(f1.start > f2.start) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("------   Yeni Round   ------");
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " sağlığı : " + this.f2.health);
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " sağlığı : " + this.f1.health);
                }
            }else {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("------   Yeni Round   ------");
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " sağlığı : " + this.f2.health);
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " sağlığı : " + this.f1.health);
                }
            }

        } else {
            System.out.println("Sporcuların sikletleri farklı!");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı.");
            return true;
        }
        else if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı.");
            return true;
        }
        return false;
    }
}



