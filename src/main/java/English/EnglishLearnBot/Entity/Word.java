//package English.EnglishLearnBot.Entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Data
//public class Word {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//
//    private String ruWord;
//
//    private String enWord;
//
//    private DifficultLevel difficultLevel;
//
//    @ManyToOne
//    @JoinColumn(name = "topic_id")
//    private Topic topic;
//
//
//
//}