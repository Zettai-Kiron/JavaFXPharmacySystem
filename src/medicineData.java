
package pharmacymanagementsystem;

import java.sql.Date;

/**
 *
 * @authors  Jude Kiron Mensah - 10947803
            Teye Elisha - 10940920
            Kelvin Sasu - 10981962
            Eyram Ampobi - 10977614
            Gyamfi Caleb Jeff  - 10967054
            Daniel Elijah Gyan - 10956566
            Koomson Jojo Emeka - 10954302
 */
public class medicineData {
    
    private Integer medicineId;
    private String brand;
    private String productName;
    private String type;
    private String status;
    private Double price;
    private Date date;
    private String image;

    // MAKE SURE YOU  WILL FOLLOW THESE DATA TYPES
    public medicineData(Integer medicineId, String brand ,String productName, String type
            , String status ,Double price, String image, Date date){
        this.medicineId = medicineId;
        this.brand = brand;
        this.productName = productName;
        this.type = type;
        this.status = status;
        this.price = price;
        this.date = date;
        this.image = image;
    }
    
    public Integer getMedicineId(){
        return medicineId;
    }
    public String getBrand(){
        return brand;
    }
    public String getProductName(){
        return productName;
    }
    public String getType(){
        return type;
    }
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return price;
    }
    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }
    
}
