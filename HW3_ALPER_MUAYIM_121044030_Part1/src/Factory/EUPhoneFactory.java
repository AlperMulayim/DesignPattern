package Factory;

import Models.AmanIflas;
import Models.IflasDeluxe;
import Models.MaxEffortModel;
import Phone.IflasPhone;
import Sales.EUMarket;

/**
 * Created by Alper on 13.12.2016.
 */
public class EUPhoneFactory  extends  PhoneFactory{

    public EUPhoneFactory(String modelName)
    {
        iflasPhone = new IflasPhone();

        if (modelName.equals("MaximumEffort")) {
            model = new MaxEffortModel();
        }
        else if(modelName.equals("IflasDelux")){
            model = new IflasDeluxe();
        }
        else if(modelName.equals("IAmanIflas")){
            model = new AmanIflas();
        }

        market = new EUMarket();

        modelProperties = model.getProperties();
        salesPacket = market.getSalesPacket();

        iflasPhone.setMarket(market.getName());
        iflasPhone.setModelName(model.getModelName());
    }

}
