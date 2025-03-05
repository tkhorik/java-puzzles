package com.mypuzzles;

public class TBank {
    /**
     * API поиска авторов и их книг по имени автора
     * При каждом поисковом запросе обновляет статистику по частоте использования поисковой строки (обновляется раз в сутки другой системой)
     * При обнаружении популярного запроса (у которого находится много авторов), отправляется алерт.
     * Алерт должен отправляться не более 1 раза в сутки для каждого запроса
     * Все классы на самом деле находятся в разных файлах, однако здесь представлены в одном месте для удобства
     */
//    @RestController
//    public class AuthorController {
//
//        @Autowired
//        private AuthorSearchService service;
//
//        @GetMapping("/authors")
//        public List<AuthorDto> readAllAuthors(@RequestParam String query) {
//            List<Author> authors = service.search(query);
//            return authors.stream().map(author -> new AuthorDto(author.getName()))
//                    .collect(Collectors.toList());
//        }
//    }
//
//    @Component
//    public class AuthorSearchService {
//
//        @Autowired
//        private AuthorRepository authorRepository;
//
//        @Autowired
//        private StatisticsRepository statisticsRepository;
//
//        private AlertRestClient arc = new AlertRestClient();
//
//        @Transactional
//        public List<Author> search(String query) {
//            List<Author> authors = authorRepository.findByNameContainingIgnoreCase(query);
//            Statistics s = statisticsRepository.findById(query).orElse(null);
//            if (s == null) {
//                s = new Statistics(query);
//            }
//            s.setNumbers(s.getNumbers() + 1);
//            statisticsRepository.save(s);
//            if (s.getNumbers() > 1000 && authors.size() > 1000) {
//                System.out.println("Too popular search with too much data, sending an alert...");
//                arc.send(query, s.getNumbers(), authors.size());
//            }
//            return authors;
//        }
//    }
//
//    public interface AuthorRepository extends CrudRepository<Author, Long> {
//        List<Author> findByNameContainingIgnoreCase(String name);
//    }
//
//    @Entity
//    @Data
//    public class Author {
//        @Id
//        @GeneratedValue
//        private Long id;
//        private String name;
//
//        @OneToMany(mappedBy = "author")
//        private List<Book> books;
//
//        public Author(String name) {
//            this.name = name;
//        }
//    }
//
//    @Entity
//    @Data
//    public class Statistics {
//        @Id
//        private String query;
//        private int numbers;
//
//        public Statistics(String query) {
//            this.query = query;
//        }
//    }
//
//    @Data
//    @AllArgsConstructor
//    public class AuthorDto {
//        private String name;
//    }
//
//
//
//
//
//
//
//
//
//
//
//    CREATE TABLE profile (
//            id BIGSERIAL PRIMARY KEY,
//            nickname VARCHAR,
//            registered_at TIMESTAMP
//    );
//
//    CREATE TABLE post (
//            id BIGSERIAL PRIMARY KEY,
//            owner_id BIGINT REFERENCES profile (id),
//    body TEXT,
//    inserted_at TIMESTAMP,
//    likes_count INT -- кол-во лайков
//);
//
//    CREATE TABLE subscription_count (
//            profile_id BIGINT REFERENCES profile (id) UNIQUE,
//    followers_count INT, -- кол-во подписчиков
//    following_count INT -- кол-во подписок
//);
//
//-- Выбери все посты, опубликованные пользователями, у которых количество подписчиков больше 500
//
//
//
//
//
//
//
//
//
//            import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//    public class Increment {
//        private static int counter1 = 0;
//        private static int counter2 = 0;
//
//        public static void main(String[] args) throws InterruptedException {
//            int tasksCount = 100_000;
//            CountDownLatch latch = new CountDownLatch(tasksCount);
//            ExecutorService executor = Executors.newFixedThreadPool(10);
//
//            for (int i = 0; i < tasksCount; i++) {
//                executor.submit(() -> {
//                    counter1++;
//                    counter2++;
//                    latch.countDown();
//                });
//            }
//
//            latch.await();
//            executor.shutdown();
//
//            System.out.println(counter1);
//            System.out.println(counter2);
//            System.exit(0);
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    class A {
//        B b;
//    }
//
//    class B {
//        A a;
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            A objA = new A();
//            B objB = new B();
//
//            objA.b = objB;
//            objB.a = objA;
//
//            // Удалятся ли объекты A и B?
//            System.gc();
//        }
//    }
}
