package ec.edu.epn.g12.Objetos;



public class Usuario {
    private String Usuario;
    private String Password;

    public void imprimirUsuario() {
        System.out.println("Usuario del Sistema:\n\tUsuario:" + getUsuario());
        System.out.println("\tcontrasena:" + getPassword());
    }
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}
