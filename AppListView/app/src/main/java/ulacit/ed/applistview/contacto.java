package ulacit.ed.applistview;

public class contacto {


    private Integer id;
    private Integer image;
    private String nombre;
    private String cargo;
    private String compania;


    public contacto(Integer id, Integer image, String nombre, String cargo, String compania) {
        this.id = id;
        this.image = image;
        this.nombre = nombre;
        this.cargo = cargo;
        this.compania = compania;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
