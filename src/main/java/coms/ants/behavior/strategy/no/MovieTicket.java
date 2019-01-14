package coms.ants.behavior.strategy.no;

/**
 * 观影类型不同得电影票价
 */
public class MovieTicket {
    private String type;//观影类型
    private double price;//票价

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 放回当前观影人类型对应得票价:
     * 学生票价八折
     * vip票价七折
     * 其余原价
     * @return
     */
    public double curTicketPrice(){
        if("student".equals(type)){
            System.out.println("学生票");
            return price*0.8;
        }else if ("vip".equals(type)){
            return price*0.7;
        }else{
            return price;
        }
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
