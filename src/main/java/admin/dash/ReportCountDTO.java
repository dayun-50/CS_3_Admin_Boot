package admin.dash;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReportCountDTO {
    private String report_type;
    private int count; // COUNT(*) 결과
}
