package annotation.custom;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestControllerWithSwagger(value = "RestMemberController", name = "RestMemberController")
@RequestMapping("/member")
public class RestMemberController {
    @ApiOperation("멤버 목록 반환")
    @GetMapping("/list")
    public ResponseEntity<String> getMemberList() {
        return ResponseEntity.ok("멤버 목록 리스트");
    }
}
