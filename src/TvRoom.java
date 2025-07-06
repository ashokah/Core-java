public class TvRoom implements A1,A2{



    public static void main(String[] args)
    {
        TvRoom t1 = new TvRoom();
        t1.DellLoptop();
        t1.hpLaptop();
    }




    @Override
    public void DellLoptop() {
        System.out.println("iam dell laptop");

    }

    @Override
    public void hpLaptop() {
        System.out.println("iam hplaptop");

    }

}
