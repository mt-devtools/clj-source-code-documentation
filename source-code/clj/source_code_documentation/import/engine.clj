
(ns source-code-documentation.import.engine
    (:require [fruits.map.api                         :as map]
              [fruits.vector.api                      :as vector]
              [io.api                                 :as io]
              [source-code-documentation.import.utils :as import.utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn import-source-file
  ; @ignore
  ;
  ; @param (string) filepath
  ; @param (map) file-data
  ;
  ; @return (map)
  [filepath {{:keys [defs defns]} :ns-map :as file-data}]
  (if-let [file-content (io/read-file filepath {:warn? true})]
          (letfn [(f2 [_ %] [(:name %) (import.utils/def-header  file-content %)])
                  (f3 [_ %] [(:name %) (import.utils/defn-header file-content %)])]
                 (-> file-data (update :headers merge (vector/to-map defs  f2))
                               (update :headers merge (vector/to-map defns f3))))))

(defn import-source-files
  ; @ignore
  ;
  ; @param (map) state
  ; @param (map) options
  ;
  ; @return (map)
  [state _]
  (letfn [(f0 [filename file-data] (if (-> file-data :create-documentation?)
                                       (-> filename (import-source-file file-data)
                                                    ; TEMP
                                                    (dissoc :ns-map))))]
                                       ;(-> file-data)))]
         (-> (map/->values state f0 {:provide-key? true})
             ; TEMP
             (map/remove-values-by nil?))))
