package admin.dash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dash")
@RestController
public class DashController {
    @Autowired
    private DashService dashService;

    @GetMapping("/pathList")
    public ResponseEntity<List<DashChartDTO>> pathList() {
        return ResponseEntity.ok(dashService.pathList());
    }

    @GetMapping("/boardReportList")
    public ResponseEntity<List<ReportCountDTO>> boardReportList() {
        return ResponseEntity.ok(dashService.boardReportList());
    }

    @GetMapping("/commentReportList")
    public ResponseEntity<List<ReportCountDTO>> commentReportList() {
        return ResponseEntity.ok(dashService.commentReportList());
    }

    @GetMapping("/ageGroup")
    public ResponseEntity<List<ReportCountDTO>> ageGroup() {
        return ResponseEntity.ok(dashService.ageGroup());
    }
}
