public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NombreRomainInit a,b;
        a=new NombreRomainInit(399);
        System.out.println(a.nombreToInt());
        System.out.println(a.intToNombre());

        b=new NombreRomainInit("CMXII");
        System.out.println(b.nombreToInt());
        System.out.println(b.intToNombre());

        b.moins(a);
        System.out.println(b.nombreToInt());
        System.out.println(b.intToNombre());

        b.plus(a);
        System.out.println(b.nombreToInt());
        System.out.println(b.intToNombre());



        System.out.println("--------------");

        NombreEntier c;
        NombreRomain d;
        c=new NombreEntier("1112");
        d=new NombreRomain("CCCXCIX");

        System.out.println(c.nombreToInt());
        System.out.println(c.intToNombre());

        System.out.println(d.nombreToInt());
        System.out.println(d.intToNombre());

        c.moins(d);
        System.out.println(c.nombreToInt());
        System.out.println(c.intToNombre());

        c.plus(d);
        System.out.println(c.nombreToInt());
        System.out.println(c.intToNombre());

    }

}
