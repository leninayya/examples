CREATE TABLE EXAMPLE (
	id BIGSERIAL,
	data JSONB,
	PRIMARY KEY (id)

);

insert into EXAMPLE (data) values ('{
    "name": "tea pot",
    "price": 12.50,
    "tags": ["home", "tea"]
}
');
