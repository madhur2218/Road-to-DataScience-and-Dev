public class BaseClass {
    public void recommendedMethod(){
        System.out.println("Base.class.recommended method: Best way to do it");
        optionalMethod();
        mandatoryMethod();

    }

    protected void optionalMethod(){
        System.out.println("Base.class.optionalMethod to do it: Customize optional method");

    }

    private void mandatoryMethod(){
        System.out.println("Base.class.mandatoryMethod to do it: NON-NEGOTIABLE!");

    }
}
