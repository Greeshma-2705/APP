% a) Logical facts
python_pass(arun).
data_pass(arun).

python_pass(bala).
data_fail(bala).

python_pass(charan).
data_pass(charan).

python_fail(divya).
data_pass(divya).

% b) Eligibility rule
eligible(X) :-
    python_pass(X),
    data_pass(X).

% c) Query to identify eligible students
% ?- eligible(X).