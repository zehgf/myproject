import request from '@/utils/request'

// 查询岗位信息列表
export function listDrug(query) {
  return request({
    url: '/pill/drug/list',
    method: 'get',
    params: query
  })
}

// 查询岗位信息详细
export function getDrug(postId) {
  return request({
    url: '/pill/drug/' + postId,
    method: 'get'
  })
}

// 新增岗位信息
export function addDrug(data) {
  return request({
    url: '/pill/drug',
    method: 'post',
    data: data
  })
}

// 修改岗位信息
export function updateDrug(data) {
  return request({
    url: '/pill/drug',
    method: 'put',
    data: data
  })
}

// 删除岗位信息
export function delDrug(postId) {
  return request({
    url: '/pill/drug/' + postId,
    method: 'delete'
  })
}
