(ns whackmole)

;(defn drawMole [index]
;  (js/jQuery )
;  )


(def score (atom 0))

(defn jq [arg] (js/jQuery arg))

(defn log [arg] (.log js/console arg))

(defn bind-events [] (.click (jq ".hole")
                       (fn [this]
                         (when (.hasClass (jq (.-target this)) "holeWithMole" )
                          (do
                            (.removeClass (jq (.-target this)) "holeWithMole" )
                            (swap! score inc)
                            (log "the score is")
                            (log @score)
                            )

                         ))))

(defn mole-at [n] (.addClass (jq (.get (jq ".hole") n)) "holeWithMole" ))

(js/jQuery bind-events)

(js/setInterval  (fn [] (mole-at (rand-int 4) ) ) 1000 )

