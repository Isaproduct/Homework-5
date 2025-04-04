package Flyweight_Pattern;
import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styleMap = new HashMap<>();

    public static MarkerStyle getMarkerStyle(String styleType) {
        MarkerStyle style = styleMap.get(styleType);

        if (style == null) {
            switch (styleType) {
                case "restaurant":
                    style = new RestaurantMarkerStyle();
                    break;
                case "hospital":
                    style = new HospitalMarkerStyle();
                    break;
                case "gasStation":
                    style = new GasStationMarkerStyle();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown marker style: " + styleType);
            }
            styleMap.put(styleType, style);
        }
        return style;
    }

    public static int getUniqueStylesCount() {
        return styleMap.size();
    }
}
