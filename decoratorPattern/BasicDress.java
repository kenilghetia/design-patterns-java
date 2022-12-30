package decoratorPattern;

interface Dress{
    public void assemble();
}

class basicDress implements Dress{
    @Override
    
    public void assemble() {
        System.out.println("Basic Dress Features");
    }
}
class DressDecorator implements Dress
{
    protected Dress dress;
    
    public DressDecorator(Dress c)
    {
        this.dress=c;
    }
    
    public void assemble()
    {
        this.dress.assemble();
    }
}

class CasualDress extends DressDecorator
{
    public CasualDress(Dress c)
    {
        super(c);
    }
        
     
    public void assemble()
    {
        super.assemble();
        System.out.println("Adding Casual Dress Features");
    }
    
}

class SportyDress extends DressDecorator
{
    public SportyDress(Dress c) 
    {
        super(c);
    }
    public void assemble()
    {
        super.assemble();
        System.out.println("Adding Sporty Dress Features");
    }
}

class FancyDress extends DressDecorator
{
    public FancyDress(Dress c) 
    {
        super(c);
    }

    public void assemble()
    {
        super.assemble();
        System.out.println("Adding Fancy Dress Features");
    }
}  

class BasicDress
{
    public static void main(String args[])
    {
        Dress sportyDress= new SportyDress(new basicDress());
        sportyDress.assemble();
        System.out.println();
        
        Dress fancyDress= new FancyDress(new basicDress());
        fancyDress.assemble();
        System.out.println();
        
        Dress casualDress= new CasualDress(new basicDress());
        casualDress.assemble();
        System.out.println();
        
        Dress sportyFancyDress= new SportyDress(new FancyDress(new basicDress()));
        sportyFancyDress.assemble();
        System.out.println();
        
        Dress casualFancyDress=new CasualDress(new FancyDress(new basicDress()));
        casualFancyDress.assemble();
        System.out.println();
        
        
            }    
}
    