public  class StringAleatorio {

static final String alfanumerico = "0123456789ABCDEFGHIGJKLMNOPQRSTUVWXYZ";

public static String cadena(){

// por defecto de 10 caracteres
String cad="";
for(int i = 0; i < 10; i++){

	cad += alfanumerico.charAt((int)(Math.random()*30));
}

return cad;
}

public static void main(String[] args){


System.out.println(cadena());


}

}
