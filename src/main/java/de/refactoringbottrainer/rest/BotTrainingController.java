package de.refactoringbottrainer.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import de.refactoringbottrainer.api.WitDataGrabber;
import de.refactoringbottrainer.model.WitObject;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/trainer")
public class BotTrainingController {
	
	@Autowired
	WitDataGrabber dataGrabber;

	@GetMapping(value = "/getObjectFromMessage/{message}", produces = "application/json")
	@ApiOperation(value = "Get Wit-Object from a message.")
	public ResponseEntity<?> getWitObject(@PathVariable String message) {
		try {
			return new ResponseEntity<WitObject>(dataGrabber.getWitObjectFromMessage(message), HttpStatus.OK);
		} catch (RestClientException e) {
			return new ResponseEntity<String>("Could not connect with Wit-API!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
