package admin.dash;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DashChartDTO {
    private int dash_cart_seq; 
    private String path_name; 
    private String path;
    private int count;
}