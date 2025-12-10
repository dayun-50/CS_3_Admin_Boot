package admin.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/report")
@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/boardList")
    public ResponseEntity<List<BoardDTO>> boardList() {
        return ResponseEntity.ok(reportService.boardList());
    }

    @GetMapping("/boardDetail")
    public ResponseEntity<List<ReportDTO>> boardDetail(@RequestParam("board_seq") int boardSeq, @AuthenticationPrincipal String id) {
        System.out.println("게시글 삭제. 삭제요청 팀 : "+id);
        return ResponseEntity.ok(reportService.boardDetail(boardSeq));
    }

    @GetMapping("/commentList")
    public ResponseEntity<List<CommentDTO>> commentList() {
        return ResponseEntity.ok(reportService.commentList());
    }

    @GetMapping("/commentDetail")
    public ResponseEntity<List<ReportDTO>> commentDetail(@RequestParam("comment_seq") int comment_seq, @AuthenticationPrincipal String id) {
        System.out.println("댓글 삭제. 삭제요청 팀 : "+id);
        return ResponseEntity.ok(reportService.commentDetail(comment_seq));
    }
}
