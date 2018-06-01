SELECT DISTINCT A.nome
FROM ALUNO A, TURMA T, PROFESSOR P, ALUNO_TURMA AT
WHERE	T.PROFESSOR_id = P.id and	
		T.id = AT.turma_id and
		AT.aluno_id = A.id and
		P.nome = 'JOAO PEDRO';

SELECT DISTINCT T.dia_da_semana
FROM TURMA T, DISCIPLINA D
WHERE	T.DISCIPLINA_id = D.id and
		D.nome = 'MATEMATICA'

(SELECT DISTINCT A.nome
 FROM ALUNO A, TURMA T, PROFESSOR P, ALUNO_TURMA AT
 WHERE  T.id = AT.turma_id and
 		AT.aluno_id = A.id and
 		T.DISCIPLINA_id = D.id and
 		D.nome = 'MATEMATICA')
INTERSECT
(SELECT DISTINCT A.nome
 FROM ALUNO A, TURMA T, PROFESSOR P, ALUNO_TURMA AT
 WHERE  T.id = AT.turma_id and
 		AT.aluno_id = A.id and
 		T.DISCIPLINA_id = D.id and
 		D.nome = 'FISICA');

SELECT DISTINCT nome
FROM DISCIPLINA
WHERE id NOT IN(SELECT DISCIPLINA_id
				FROM TURMA);

SELECT DISTINCT A.nome
FROM ALUNO A, TURMA T, PROFESSOR P, ALUNO_TURMA AT
WHERE   T.id = AT.turma_id and
		AT.aluno_id = A.id and
 		T.DISCIPLINA_id = D.id and
 		D.nome = 'MATEMATICA' and
 		A.id NOT IN( SELECT DISTINCT A.nome
					 FROM ALUNO A, TURMA T, PROFESSOR P, ALUNO_TURMA AT
					 WHERE  T.id = AT.turma_id and
					 		AT.aluno_id = A.id and
					 		T.DISCIPLINA_id = D.id and
					 		D.nome = 'QUIMICA');




