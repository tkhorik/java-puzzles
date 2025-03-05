-- SQL Query for Profiles with More Than 10 Posts

CREATE TABLE profile (
                         id BIGSERIAL PRIMARY KEY,
                         nickname VARCHAR,
                         registered_at TIMESTAMP
);

CREATE TABLE post (
                      id BIGSERIAL PRIMARY KEY,
                      owner_id BIGINT REFERENCES profile(id),
                      body TEXT,
                      inserted_at TIMESTAMP,
                      likes_count INT
);

CREATE TABLE subscription_count (
                                    profile_id BIGINT REFERENCES profile(id) UNIQUE,
                                    followers_count INT,
                                    following_count INT
);

-- Query to select profiles with more than 10 posts
SELECT p.*
FROM profile p
         JOIN (
    SELECT owner_id
    FROM post
    GROUP BY owner_id
    HAVING COUNT(id) > 10
) AS post_count ON p.id = post_count.owner_id;




