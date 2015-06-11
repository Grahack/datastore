(clojure.stacktrace/print-stack-trace (Exception. "foo"))
;; Prints
;; > java.lang.Exception: foo
;; >  at user$eval112.invoke (NO_SOURCE_FILE:1)
;; >     clojure.lang.Compiler.eval (Compiler.java:6619)
;; >     clojure.lang.Compiler.eval (Compiler.java:6582)
;; >     clojure.core$eval.invoke (core.clj:2852)
;; >     clojure.main$repl$read_eval_print__6588$fn__6591.invoke (main.clj:259)
;; >     clojure.main$repl$read_eval_print__6588.invoke (main.clj:259)
;; >     clojure.main$repl$fn__6597.invoke (main.clj:277)
;; >     clojure.main$repl.doInvoke (main.clj:277)
;; >     clojure.lang.RestFn.invoke (RestFn.java:1096)
;; >     clojure.tools.nrepl.middleware.interruptible_eval$evaluate$fn__3615.invoke (interruptible_eval.clj:56)
;; >     clojure.lang.AFn.applyToHelper (AFn.java:159)
;; >     clojure.lang.AFn.applyTo (AFn.java:151)
;; >     clojure.core$apply.invoke (core.clj:617)
;; >     clojure.core$with_bindings_STAR_.doInvoke (core.clj:1788)
;; >     clojure.lang.RestFn.invoke (RestFn.java:425)
;; >     clojure.tools.nrepl.middleware.interruptible_eval$evaluate.invoke (interruptible_eval.clj:41)
;; >     clojure.tools.nrepl.middleware.interruptible_eval$interruptible_eval$fn__3656$fn__3659.invoke (interruptible_eval.clj:171)
;; >     clojure.core$comp$fn__4154.invoke (core.clj:2330)
;; >     clojure.tools.nrepl.middleware.interruptible_eval$run_next$fn__3649.invoke (interruptible_eval.clj:138)
;; >     clojure.lang.AFn.run (AFn.java:24)
;; >     java.util.concurrent.ThreadPoolExecutor.runWorker (:-1)
;; >     java.util.concurrent.ThreadPoolExecutor$Worker.run (:-1)
;; >     java.lang.Thread.run (:-1)
;;
;; => nil

(clojure.stacktrace/print-stack-trace (Exception. "foo") 4)
;; Prints
;; > java.lang.Exception: foo
;; >  at user$eval124.invoke (NO_SOURCE_FILE:1)
;; >      clojure.lang.Compiler.eval (Compiler.java:6619)
;; >  clojure.lang.Compiler.eval (Compiler.java:6582)
;; >  clojure.core$eval.invoke (core.clj:2852)
;;
;; => nil
