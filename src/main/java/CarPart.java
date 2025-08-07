import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car-parts")
public class CarPart {
    private Long id;
    private String name;
    private String manufacturer;
    private double price;
    private boolean inStock;

    //Constructors
    public CarPart() {}

    public CarPart(Long id, String name, String manufacturer, double price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.inStock = inStock;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean getInStock() { return inStock; }
    public void setInStock(boolean inStock) { this.inStock = inStock; }

}
