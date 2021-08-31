public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    } // 생성자

    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    } // 생성자 오버로딩
    
    public void sleep() {
        System.out.println(this.name+" zzz in house");
    } // 오버라이딩

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    } //오버로딩
    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);
        System.out.println(yorkshire.name);
    }
}