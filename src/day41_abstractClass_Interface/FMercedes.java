package day41_abstractClass_Interface;

public class FMercedes extends DAraba{
    @Override
    protected void yakit() {
        /*
        Abstract bir parent'in concrete child class(Mercedes)
        parent abstract class'daki tum abstract method'lari override etmek zorundadir

        abstract bir class(Toyota), abstract baska bir class'i(DAraba) parent edinirse
        parent class'daki tum abstract method'lari override etmek ZORUNDA DEGILDIR

         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
