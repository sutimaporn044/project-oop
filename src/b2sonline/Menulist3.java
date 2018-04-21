
package b2sonline;

   
public class Menulist3 extends B2SOnline   implements literature,cartoon,IT,Food,Documentary{
private String to;
    private String form;
Menulist3(String a ,String b){
this.to = a ;
this.form= b ;
}
public String subject;
public Menulist3(String subject) {
this.subject = subject;
}
public void study(){
System.out.println("สินค้าสุดฮิตในช่วงนี้");}
public void print(){
System.out.println("บริษัท บีทูเอช จำกัด ยินดีบริการ");

this.study();
System.out.println("ถูกใจ... " + subject+"ใช่ไหม");

System.out.println("ถูกใจ... " + subject+"ใช่ไหม");
}

public void literature1(){System.out.println("7::: หนังสือวรรณกรรม ราคา 150บาท");}
public void cartoon1(){System.out.println("8:: หนังสือการ์ตูน ราคา 99บาท");}
public void IT1(){System.out.println("9:: หนังสือไอที ราคา 200");}
public void food1(){System.out.println("10::: หนังสืออาหาร ราคา 120 บาท ");}
public void musician(){System.out.println("11::: หนังสือดนตรี  ราคา 140 บาท");}
public void Documentary(){System.out.println("12:: หนังสือประวัติศารต์ร์ ราคา 115");}
{
    

   literature1(); 
cartoon1();
IT1();
 food1();
 musician();
 Documentary();
 
}

}
 

