CREATE TABLE statistics
(
    id         SERIAL PRIMARY KEY,
    post_id    INT NOT NULL,
    query_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    view_count INT       DEFAULT 0,
    FOREIGN KEY (post_id) REFERENCES posts (id)
);
