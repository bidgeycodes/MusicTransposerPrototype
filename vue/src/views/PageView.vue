<template>
  <div class="page-wrapper">
    <div class="title-container">
      <h4>Welcome To</h4>
      <h1>Do-Re-Mi-Fa-So-La-Ti-Do</h1>
    </div>
    <div class="button-container">
      <!-- Button Component -->
    </div>
    <div class="piano-container">
      <Piano />
    </div>
    <div class="response-container">
      <!-- Response Component -->
    </div>
    <div class="reset-container">
      <!--Reset Button Component-->
    </div>
  </div>
</template>

<script setup lang="ts">

import Piano from "../components/Piano.vue"

</script>

<style>
div {
  border: 1px solid black;
}

.page-wrapper {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.title-container > h4, h1 {
  height: auto;
  width: 100%;
  flex-direction: column;
  align-items: center;
  justify-content: center !important;
  display: inline-block;
}

h4, h1 {
  text-align: center;
}

.button-container {
  width: 100%;
  height: 7vh;
}

.piano-container {
  height: auto;
  width: 100%;
}

.response-container {
  width: 100%;
  height: 5vh;
}

.reset-container {
  width: 100%;
  height: 5vh;
}


</style>
