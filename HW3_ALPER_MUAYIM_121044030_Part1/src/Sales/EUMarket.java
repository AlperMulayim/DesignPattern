package Sales;

/**
 * Created by Alper on 12.12.2016.
 */
public class EUMarket implements  Market {

    String name ;
    SalesPacket packetEU;

    public EUMarket()
    {
        this.name  = "EUMarket";
        this.packetEU = new SalesPacket();

        this.packetEU.setDisplayBit(24);
        this.packetEU.setBattteryType("Lıtyum- Iyon");
        this.packetEU.setCpuCore(4);
        this.packetEU.setMaxStorage(64);
        this.packetEU.setOptiZoom(3);
        this.packetEU.setMaxProof(100);

    }


    @Override
    public SalesPacket getSalesPacket() {
        return packetEU;
    }

    @Override
    public String getName() {
        return name;
    }
}
