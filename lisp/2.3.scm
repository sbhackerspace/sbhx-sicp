(define (length sequence)
  (accumulate (lambda (x y);;this fails miserably
		2)
	      0
	      sequence))

(define (accumulate op initial sequence)
  (if (null? sequence)
      initial
      (op (car sequence)
          (accumulate op initial (cdr sequence)))))


(define (last-pair seq)
  (if (null? (cdr seq))
      (car seq)
      (last-pair (cdr seq))))


(define i (list 1 2 3 4 5))

(define j (list 6 7 8))

(define (map proc seq)
  (if (null? seq)
      nil
      (cons (proc (car seq))
	    (map proc (cdr seq)))))

(define (reverse seq)
  (if (null? (cdr seq))
      seq
      (append (reverse (cdr seq))
	      (list (car seq)))))

(define nil '())

(define (same-parity . seq)
  (define (iter result rest mod2)
    (if (null? rest)
	(reverse result)
	(if (= mod2 (remainder (car rest) 2))
	    (iter (cons (car rest) result)
		  (cdr rest)
		  mod2)
	    (iter result
		  (cdr rest)
		  mod2))))
  (iter nil
	seq
	(remainder (car seq) 2)))

(define (append seq1 seq2)
  (if (null? seq1)
      seq2
      (cons (car seq1) (append (cdr seq1) seq2))))

(define (for-each proc seq)
  (cond ((not (null? seq))
	 (proc (car seq))
	 (for-each proc (cdr seq)))))

(define (deep-reverse seq)
  (map reverse
       (reverse seq)))

(define (fringe tree);;study this
  (cond ((null? tree) nil)
	((not (pair? tree))(list tree))
	(else (append (fringe (car tree))
		      (fringe (cdr tree))))))
	      

(define k (list i j))

(fringe k)




