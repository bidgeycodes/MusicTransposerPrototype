<template>
  <div class="title-container">
    <h4>Welcome</h4>
    <h1>Do-Re-Mi-Fa-So-La-Ti-Do</h1>
  </div>
  <div class="button-container">
    <!-- Button Component -->
  </div>
  <div class="piano-container">
    <PianoComponent />
  </div>
  <div class="response-container">
    <!-- Response Component -->
  </div>
</template>

<script setup lang="ts">

import PianoComponent from "../components/PianoComponent.vue"

</script>

<style>

div {
  border: 1px solid black;
}

.title-container > h4, h1 {
  height: 5vh;
  width: 100%;
}

.button-container {
  width: 20vw;
  height: 7vh;
}

.piano-container {
  width: 100%;
  height: 45vh;
}

.response-container {
  width: 100%;
  height: 5vh;
}


</style>
