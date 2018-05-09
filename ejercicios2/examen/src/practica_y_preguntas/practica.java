package practica_y_preguntas;

//TRABAJO
//1. this(new Empresa(),”Descripción por defecto” , TipoTrabajo.REPARACION, 0, new GregorianCalendar());
//2. // se hace con assert 
//3. if (descripción != null &&! descripción.equals(“”) && ! descripción.equals(“”)){ 
//4. // (falta paréntesis supuestamente) asset tipo != null && tipo.matches(sfdsafas)
//5. if ( coste >= 0 ){
//6. trabajo1 = new Trabajo();
//7. trabajo2 = new Trabajo(new Empresa(), “Sustitución termostato”, TipoTrabajo.REPARACION, 300 ,new GregorianCalendar(2015, 3, 12));
//8.trabajo3 = new Trabajo(trabajo2);
//9. // falla validación del cliente, no se encuentra el dato del cliente (null);
//10. // falla validación de la descripcion, no se encuentra el dato de la descripcion (“ ”);
//11. // falla validación del tipo, no se encuentra el dato del tipo (null);
//12. // falla validación del coste, coste negativo (-300);
//13. // falla validación de la fecha, no se encuentra el dato de la fecha (null);
//14. trabajo1.setEmpresa(null);
//15. trabajo1.setDescripcion(“ “);
//16. trabajo1.setTipo(null);
//16. trabajo1.setCoste(-300);
//17. trabajo1.setFecha(null);











































//1. this(“Nueva empresa”, “A3000000B”, “Domicilio por defecto”, “+12999999999”, TipoEmpresa.INDUSTRIAL);

//2. if (nombre == null || ! nombre.matches(“^[A-ZÁÉÍÓÚÑ][áéíóúña-z\\. \\w]+”)) {

//3. if (cif == null || ! cif.matches(“^[ABCDEFGHJPQRSUVNW][0-9]{7}[A-J0-9]”)) {

//4. if (domicilio == null || ! domicilio.matches(“^[\\w][\\wÁÉÍÓÚÑáéíóúñ/ , \\d]+”)) {

//5. if (teléfono == null || ! teléfono.matches(“^\\+[0-9]{1,3}[0-9]{2,3}[0-9]{6,7}”)) {

//6. empresa1 = new Empresa()

//7. empresa2 = new Empresa(“Reme S.A.”, “A301234567”, “C/Brava, 5, 30012, Murcia”, “968123456”, TipoEmpresa.INDUSTRIAL)

//8. empresa3 = new Empresa(empresa2)

//9. //Falla validación del nombre
//empresa4 = new Empresa(el nombre es igual a “”);

//10. //Falla validación del cif
//empresa4 = new Empresa(el cif es igual a null);

//11. //Falla validación del domicilio
//empresa4 = new Empresa(el domicilio es igual a “123”);
//----------> domicilio debería ser “”

//12. //Falla validación del telefono
//empresa4 = new Empresa(el telefono es igual a “”);
//----------> numero deberia ser “123”

//13. //Falla validación del tipo
//empresa4 = new Empresa(el tipo es igual a null);

//14. empresa1.setNombre(null);

//15. empresa1.setCif(null);

//16. empresa1.setDomicilio(“ ”);

//17. empresa1.setTelefono(“123”);

//18. empresa1.setTipo(null);