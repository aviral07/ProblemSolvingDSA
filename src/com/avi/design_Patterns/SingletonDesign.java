class SingletonDesign{

private static SingletonDesign singletonInstanxe=new SingletonDesign();  //only one time this instance get the memory
                //making it private so that u can get it through getInstance method only

    //eager loading
   private SingletonDesign(){

    }  //So that you will not get the instance of this c4lass using new keyword
    public static SingletonDesign getInstance(){
       return  singletonInstanxe;
    }
    public void simleMethod(){
       System.out.println("Hashcode pf the singleton Object" +singletonInstanxe);
    }


    //three steps
      
}