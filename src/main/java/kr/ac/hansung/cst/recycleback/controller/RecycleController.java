package kr.ac.hansung.cst.recycleback.controller;

import kr.ac.hansung.cst.recycleback.model.Recycle;
import kr.ac.hansung.cst.recycleback.service.RecycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "/recycles")
public class RecycleController {

    @Autowired
    RecycleService recycleService;

    @PostMapping
    public ResponseEntity<?> addRecycle(@RequestBody Recycle request){
        return ResponseEntity.ok(recycleService.createRecycle(request));
    }

    @GetMapping("/article/{category}")
    public ResponseEntity<?> retrieveArticle(@PathVariable String category){
        return ResponseEntity.ok(recycleService.getArticle(category));
    }

    @GetMapping("/infor/{article}")
    public ResponseEntity<?> retrieveInfor(@PathVariable String article){
        return ResponseEntity.ok(recycleService.getInfor(article));
    }
}
