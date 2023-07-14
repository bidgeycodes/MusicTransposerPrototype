<!-- PianoKey.vue -->
<template>
    <div class="piano-key" @mouseover="showInfo" @mouseleave="hideInfo">
      <div class="note-info" v-show="isHover">
        {{ note }}
      </div>
    </div>
  </template>
  
  <script>

  export default {
    props: ['note'],
    data() {
      return {
        isHover: false,
      };
    },
    methods: {
      showInfo() {
        this.isHover = true;
      },
      hideInfo() {
        this.isHover = false;
      },
    },
  };
  </script>
  
  <!-- <style scoped>
  .piano-key {
    position: relative;
  }
  
  .note-info {
    position: absolute;
    bottom: -20px;
    left: 50%;
    transform: translateX(-50%);
  }
  </style> -->