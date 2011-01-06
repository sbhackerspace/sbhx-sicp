(define (print-point p)
  (newline)
  (display "(")
  (display (x-point p))
  (display ",")
  (display (y-point p))
  (display ")"))

(define (make-point x y)
  (cons x y))

(define (x-point p)
  (car p))

(define (y-point p)
  (cdr p))


(define (make-segment a b)
  (cons a b))

(define (start-segment a)
  (car a))

(define (end-segment a)
  (cdr a))

(define (midpoint a)
  (make-point (/
	       (+ (x-point (start-segment a))
		  (x-point (end-segment a)))
	       2)
	      (/
	       (+ (y-point (start-segment a))
		  (y-point (end-segment a)))
	       2)))

