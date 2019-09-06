(ns recurrent-3d.core)

(defrecord
  Scene
  [entities meshes textures])

(defprotocol
  Renderer)


