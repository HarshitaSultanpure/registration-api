package registrationapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class StudentController {

	@PostMapping("/register")
	public ResponseEntity<?> registerStudnet(@Valid @RequestBody Student student, BindingResult result)
	{
		if(result.hasErrors()) {
			String errors = result.getAllErrors().stream().map(error -> error.getDefaultMessage()).collect(Collectors.joining(", "));
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"errors\": \"" + errors + "\"}");
		}
		return ResponseEntity.ok("{\"message\": \"Registration successful\"}");
	}
}
