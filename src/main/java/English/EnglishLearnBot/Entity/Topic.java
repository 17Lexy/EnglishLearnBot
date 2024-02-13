//package English.EnglishLearnBot.Entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Entity
//@Data
//public class Topic {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
//    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Word> words;
//
//}
