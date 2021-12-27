INSERT INTO questionnaire (id, title, description) VALUES (1, 'GoTech Questionnaire', 'Show me what you got!');

INSERT INTO multiple_choice_question (questionnaire_id, id, title, has_Other, required, index) VALUES (1, 1, 'What language is your favorite?', false, true, 0);
INSERT INTO multiple_choice_question_choices (multiple_choice_question_id, choices) VALUES (1, 'JavaScript');
INSERT INTO multiple_choice_question_choices (multiple_choice_question_id, choices) VALUES (1, 'TypeScript');
INSERT INTO multiple_choice_question_choices (multiple_choice_question_id, choices) VALUES (1, 'CoffeeScript');

INSERT INTO text_question (questionnaire_id, id, title, required, index) VALUES (1, 2, 'Why do you like TypeScript?', true, 1);
INSERT INTO condition (id, operator, question_id, value) VALUES (1, '=', '1', 'TypeScript');
UPDATE text_question SET condition_id = 1;

INSERT INTO text_question (questionnaire_id, id, title, required, index) VALUES (1, 3, 'What do you like about programming?', false, 2);

INSERT INTO multiple_choice_question (questionnaire_id, id, title, has_Other, required, index) VALUES (1, 4, 'How was the assignment?', true, true, 3);
INSERT INTO multiple_choice_question_choices (multiple_choice_question_id, choices) VALUES (4, 'Easy');
INSERT INTO multiple_choice_question_choices (multiple_choice_question_id, choices) VALUES (4, 'Normal');
INSERT INTO multiple_choice_question_choices (multiple_choice_question_id, choices) VALUES (4, 'Hard');
