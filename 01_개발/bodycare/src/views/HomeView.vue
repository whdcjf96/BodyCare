<template>
  <div id="content-wrapper" class="d-flex flex-column">
    <HeaderCom></HeaderCom>
    <FooterCom></FooterCom>
  </div>
</template>

<script>

import HeaderCom from '@/components/HeaderCom.vue'
import FooterCom from '@/components/FooterCom.vue'
export default {
  name: "HomeView",
  components: {
    HeaderCom,
    FooterCom
  }

}
</script>

<style>

</style>