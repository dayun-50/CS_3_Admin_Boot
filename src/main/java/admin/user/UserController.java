package admin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/userList")
    public ResponseEntity<List<UserDTO>> userList() {
        return ResponseEntity.ok(userService.userList());
    }

    @PostMapping("/secession")
    public ResponseEntity<Integer> secessionUser(@RequestBody UserDTO dto,  @AuthenticationPrincipal String id) {
        System.out.println("멤버 강제 탈퇴. 요청 팀 : " + id);
        return ResponseEntity.ok(userService.secessionUser(dto));
    }
    
}
