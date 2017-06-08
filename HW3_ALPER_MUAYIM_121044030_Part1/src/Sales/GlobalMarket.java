package Sales;

/**
 * Created by Alper on 12.12.2016.
 */
public class GlobalMarket implements Market {

    String name;
    SalesPacket salesPacket;


    public GlobalMarket()
    {
        salesPacket = new SalesPacket();
        this.name = "Global";
        this.salesPacket.setMaxProof(50);
        this.salesPacket.setOptiZoom(2);
        this.salesPacket.setBattteryType("Lityum-Cobalt");
        this.salesPacket.setCpuCore(2);
        this.salesPacket.setDisplayBit(24);
        this.salesPacket.setMaxStorage(32);

    }
    @Override
    public SalesPacket getSalesPacket() {
        return salesPacket;
    }

    @Override
    public String getName() {
        return name;
    }
}
