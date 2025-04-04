package Flyweight_Pattern;
import java.util.ArrayList; // Неправильный импорт


import java.util.List; // Неправильный импорт

public class MarkerStyleFactory {
    private static final List<MarkerStyle> styleList = new ArrayList<>(); // Ошибка: используем List вместо Map

    public static MarkerStyle getMarkerStyle(String styleType) {
        MarkerStyle style = null;

        for (MarkerStyle markerStyle : styleList) { // Ошибка: перебор по List, вместо Map
            if (markerStyle.getClass().getSimpleName().equalsIgnoreCase(styleType)) {
                style = markerStyle;
                break;
            }
        }

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
            styleList.add(style); // Ошибка: добавляем в List, хотя должно быть в Map
        }
        return style;
    }

    public static int getUniqueStylesCount() {
        return styleList.size(); // Ошибка: возвращаем количество элементов в List, а должно быть в Map
    }
}
